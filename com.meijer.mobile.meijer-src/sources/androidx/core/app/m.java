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
        final Bundle f53921a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f53922b;

        /* renamed from: c, reason: collision with root package name */
        private final w[] f53923c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f53924d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53925e;

        /* renamed from: f, reason: collision with root package name */
        boolean f53926f;

        /* renamed from: g, reason: collision with root package name */
        private final int f53927g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f53928h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f53929i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f53930j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f53931k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f53932l;

        /* renamed from: androidx.core.app.m$a$a, reason: collision with other inner class name */
        public static final class C1107a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f53933a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f53934b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f53935c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f53936d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f53937e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<w> f53938f;

            /* renamed from: g, reason: collision with root package name */
            private int f53939g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f53940h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f53941i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f53942j;

            public C1107a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C1107a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.j(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f53941i && this.f53935c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f53938f;
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
                return new a(this.f53933a, this.f53934b, this.f53935c, this.f53937e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]), this.f53936d, this.f53939g, this.f53940h, this.f53941i, this.f53942j);
            }

            private C1107a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f53936d = true;
                this.f53940h = true;
                this.f53933a = iconCompat;
                this.f53934b = e.e(charSequence);
                this.f53935c = pendingIntent;
                this.f53937e = bundle;
                this.f53938f = wVarArr == null ? null : new ArrayList<>(Arrays.asList(wVarArr));
                this.f53936d = z10;
                this.f53939g = i10;
                this.f53940h = z11;
                this.f53941i = z12;
                this.f53942j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.j(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public PendingIntent a() {
            return this.f53931k;
        }

        public boolean b() {
            return this.f53925e;
        }

        public Bundle c() {
            return this.f53921a;
        }

        public IconCompat d() {
            int i10;
            if (this.f53922b == null && (i10 = this.f53929i) != 0) {
                this.f53922b = IconCompat.j(null, "", i10);
            }
            return this.f53922b;
        }

        public w[] e() {
            return this.f53923c;
        }

        public int f() {
            return this.f53927g;
        }

        public boolean g() {
            return this.f53926f;
        }

        public CharSequence h() {
            return this.f53930j;
        }

        public boolean i() {
            return this.f53932l;
        }

        public boolean j() {
            return this.f53928h;
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f53926f = true;
            this.f53922b = iconCompat;
            if (iconCompat != null && iconCompat.n() == 2) {
                this.f53929i = iconCompat.l();
            }
            this.f53930j = e.e(charSequence);
            this.f53931k = pendingIntent;
            this.f53921a = bundle == null ? new Bundle() : bundle;
            this.f53923c = wVarArr;
            this.f53924d = wVarArr2;
            this.f53925e = z10;
            this.f53927g = i10;
            this.f53926f = z11;
            this.f53928h = z12;
            this.f53932l = z13;
        }
    }

    public static class b extends h {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f53943e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f53944f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f53945g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f53946h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f53947i;

        public b() {
        }

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.m$b$b, reason: collision with other inner class name */
        private static class C1108b {
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
            this.f53944f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f53945g = true;
            return this;
        }

        public b i(Icon icon) {
            this.f53944f = icon == null ? null : IconCompat.a(icon);
            this.f53945g = true;
            return this;
        }

        public b j(Bitmap bitmap) {
            this.f53943e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Context contextF;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.f54018b);
            IconCompat iconCompat = this.f53943e;
            Context contextF2 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (lVar instanceof o) {
                        contextF = ((o) lVar).f();
                    } else {
                        contextF = null;
                    }
                    C1108b.a(bigContentTitle, this.f53943e.u(contextF));
                } else if (iconCompat.n() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f53943e.k());
                }
            }
            if (this.f53945g) {
                if (this.f53944f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (lVar instanceof o) {
                        contextF2 = ((o) lVar).f();
                    }
                    a.a(bigContentTitle, this.f53944f.u(contextF2));
                }
            }
            if (this.f54020d) {
                bigContentTitle.setSummaryText(this.f54019c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C1108b.c(bigContentTitle, this.f53947i);
                C1108b.b(bigContentTitle, this.f53946h);
            }
        }

        public b k(CharSequence charSequence) {
            this.f54018b = e.e(charSequence);
            return this;
        }

        public b l(CharSequence charSequence) {
            this.f54019c = e.e(charSequence);
            this.f54020d = true;
            return this;
        }
    }

    public static class c extends h {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f53948e;

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
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.f54018b).bigText(this.f53948e);
            if (this.f54020d) {
                bigTextStyleBigText.setSummaryText(this.f54019c);
            }
        }

        public c h(CharSequence charSequence) {
            this.f53948e = e.e(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f54018b = e.e(charSequence);
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
        boolean f53949A;

        /* renamed from: B, reason: collision with root package name */
        boolean f53950B;

        /* renamed from: C, reason: collision with root package name */
        String f53951C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f53952D;

        /* renamed from: E, reason: collision with root package name */
        int f53953E;

        /* renamed from: F, reason: collision with root package name */
        int f53954F;

        /* renamed from: G, reason: collision with root package name */
        Notification f53955G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f53956H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f53957I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f53958J;

        /* renamed from: K, reason: collision with root package name */
        String f53959K;

        /* renamed from: L, reason: collision with root package name */
        int f53960L;

        /* renamed from: M, reason: collision with root package name */
        String f53961M;

        /* renamed from: N, reason: collision with root package name */
        long f53962N;

        /* renamed from: O, reason: collision with root package name */
        int f53963O;

        /* renamed from: P, reason: collision with root package name */
        int f53964P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f53965Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f53966R;

        /* renamed from: S, reason: collision with root package name */
        boolean f53967S;

        /* renamed from: T, reason: collision with root package name */
        Object f53968T;

        /* renamed from: U, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f53969U;

        /* renamed from: a, reason: collision with root package name */
        public Context f53970a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f53971b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<u> f53972c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f53973d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f53974e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f53975f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f53976g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f53977h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f53978i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f53979j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f53980k;

        /* renamed from: l, reason: collision with root package name */
        int f53981l;

        /* renamed from: m, reason: collision with root package name */
        int f53982m;

        /* renamed from: n, reason: collision with root package name */
        boolean f53983n;

        /* renamed from: o, reason: collision with root package name */
        boolean f53984o;

        /* renamed from: p, reason: collision with root package name */
        h f53985p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f53986q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f53987r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f53988s;

        /* renamed from: t, reason: collision with root package name */
        int f53989t;

        /* renamed from: u, reason: collision with root package name */
        int f53990u;

        /* renamed from: v, reason: collision with root package name */
        boolean f53991v;

        /* renamed from: w, reason: collision with root package name */
        String f53992w;

        /* renamed from: x, reason: collision with root package name */
        boolean f53993x;

        /* renamed from: y, reason: collision with root package name */
        String f53994y;

        /* renamed from: z, reason: collision with root package name */
        boolean f53995z;

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
            this.f53971b = new ArrayList<>();
            this.f53972c = new ArrayList<>();
            this.f53973d = new ArrayList<>();
            this.f53983n = true;
            this.f53995z = false;
            this.f53953E = 0;
            this.f53954F = 0;
            this.f53960L = 0;
            this.f53963O = 0;
            this.f53964P = 0;
            Notification notification = new Notification();
            this.f53966R = notification;
            this.f53970a = context;
            this.f53959K = str;
            notification.when = System.currentTimeMillis();
            this.f53966R.audioStreamType = -1;
            this.f53982m = 0;
            this.f53969U = new ArrayList<>();
            this.f53965Q = true;
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
                Notification notification = this.f53966R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f53966R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(h hVar) {
            if (this.f53985p != hVar) {
                this.f53985p = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e B(CharSequence charSequence) {
            this.f53966R.tickerText = e(charSequence);
            return this;
        }

        public e C(long j10) {
            this.f53962N = j10;
            return this;
        }

        public e D(long[] jArr) {
            this.f53966R.vibrate = jArr;
            return this;
        }

        public e E(int i10) {
            this.f53954F = i10;
            return this;
        }

        public e F(long j10) {
            this.f53966R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f53971b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f53971b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new o(this).c();
        }

        public Bundle d() {
            if (this.f53952D == null) {
                this.f53952D = new Bundle();
            }
            return this.f53952D;
        }

        public e f(boolean z10) {
            o(16, z10);
            return this;
        }

        public e g(String str) {
            this.f53959K = str;
            return this;
        }

        public e h(int i10) {
            this.f53953E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f53976g = pendingIntent;
            return this;
        }

        public e l(RemoteViews remoteViews) {
            this.f53957I = remoteViews;
            return this;
        }

        public e m(int i10) {
            Notification notification = this.f53966R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f53966R.deleteIntent = pendingIntent;
            return this;
        }

        public e p(int i10) {
            this.f53964P = i10;
            return this;
        }

        public e q(Bitmap bitmap) {
            this.f53979j = bitmap == null ? null : IconCompat.f(m.b(this.f53970a, bitmap));
            return this;
        }

        public e r(int i10, int i11, int i12) {
            Notification notification = this.f53966R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e s(boolean z10) {
            this.f53995z = z10;
            return this;
        }

        public e t(int i10) {
            this.f53981l = i10;
            return this;
        }

        public e v(int i10) {
            this.f53982m = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f53983n = z10;
            return this;
        }

        public e x(boolean z10) {
            this.f53967S = z10;
            return this;
        }

        public e y(int i10) {
            this.f53966R.icon = i10;
            return this;
        }

        public e z(Uri uri) {
            Notification notification = this.f53966R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f53966R.audioAttributes = a.a(builderD);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f53975f = e(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f53974e = e(charSequence);
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }

    public static class f extends h {

        /* renamed from: e, reason: collision with root package name */
        private int f53996e;

        /* renamed from: f, reason: collision with root package name */
        private u f53997f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f53998g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f53999h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f54000i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f54001j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f54002k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f54003l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f54004m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f54005n;

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
            int i10 = this.f53996e;
            if (i10 == 1) {
                return this.f54017a.f53970a.getResources().getString(Y1.f.f42834e);
            }
            if (i10 == 2) {
                return this.f54017a.f53970a.getResources().getString(Y1.f.f42835f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f54017a.f53970a.getResources().getString(Y1.f.f42836g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(Z1.b.c(this.f54017a.f53970a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f54017a.f53970a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C1107a(IconCompat.i(this.f54017a.f53970a, i10), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i10 = Y1.d.f42782b;
            int i11 = Y1.d.f42781a;
            PendingIntent pendingIntent = this.f53998g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f54001j;
            return k(z10 ? i10 : i11, z10 ? Y1.f.f42831b : Y1.f.f42830a, this.f54002k, Y1.b.f42777a, pendingIntent);
        }

        private a m() {
            int i10 = Y1.d.f42783c;
            PendingIntent pendingIntent = this.f53999h;
            return pendingIntent == null ? k(i10, Y1.f.f42833d, this.f54003l, Y1.b.f42778b, this.f54000i) : k(i10, Y1.f.f42832c, this.f54003l, Y1.b.f42778b, pendingIntent);
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
                u uVar = this.f53997f;
                builderA.setContentTitle(uVar != null ? uVar.c() : null);
                Bundle bundle = this.f54017a.f53952D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f54017a.f53952D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                u uVar2 = this.f53997f;
                if (uVar2 != null) {
                    if (uVar2.a() != null) {
                        b.b(builderA, this.f53997f.a().u(this.f54017a.f53970a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f53997f.h());
                    } else {
                        a.a(builderA, this.f53997f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f53996e;
            if (i11 == 1) {
                callStyleA = d.a(this.f53997f.h(), this.f53999h, this.f53998g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f53997f.h(), this.f54000i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f53997f.h(), this.f54000i, this.f53998g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                FS.log_d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f53996e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(lVar.a());
                Integer num = this.f54002k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f54003l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f54005n);
                IconCompat iconCompat = this.f54004m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.u(this.f54017a.f53970a));
                }
                d.f(callStyleA, this.f54001j);
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f53996e);
            bundle.putBoolean("android.callIsVideo", this.f54001j);
            u uVar = this.f53997f;
            if (uVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(uVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", uVar.i());
                }
            }
            IconCompat iconCompat = this.f54004m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.u(this.f54017a.f53970a)));
            }
            bundle.putCharSequence("android.verificationText", this.f54005n);
            bundle.putParcelable("android.answerIntent", this.f53998g);
            bundle.putParcelable("android.declineIntent", this.f53999h);
            bundle.putParcelable("android.hangUpIntent", this.f54000i);
            Integer num = this.f54002k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f54003l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f54017a.f53971b;
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
        private final List<d> f54006e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<d> f54007f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private u f54008g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f54009h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f54010i;

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
            private final CharSequence f54011a;

            /* renamed from: b, reason: collision with root package name */
            private final long f54012b;

            /* renamed from: c, reason: collision with root package name */
            private final u f54013c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f54014d = new Bundle();

            /* renamed from: e, reason: collision with root package name */
            private String f54015e;

            /* renamed from: f, reason: collision with root package name */
            private Uri f54016f;

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
                CharSequence charSequence = this.f54011a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f54012b);
                u uVar = this.f54013c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f54013c.h()));
                    } else {
                        bundle.putBundle("person", this.f54013c.i());
                    }
                }
                String str = this.f54015e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f54016f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f54014d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f54015e;
            }

            public Uri c() {
                return this.f54016f;
            }

            public u d() {
                return this.f54013c;
            }

            public CharSequence e() {
                return this.f54011a;
            }

            public long f() {
                return this.f54012b;
            }

            public d(CharSequence charSequence, long j10, u uVar) {
                this.f54011a = charSequence;
                this.f54012b = j10;
                this.f54013c = uVar;
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
                this.f54006e.add(dVar);
                if (this.f54006e.size() > 25) {
                    this.f54006e.remove(0);
                }
            }
            return this;
        }

        public g i(CharSequence charSequence, long j10, u uVar) {
            h(new d(charSequence, j10, uVar));
            return this;
        }

        public boolean j() {
            e eVar = this.f54017a;
            if (eVar != null && eVar.f53970a.getApplicationInfo().targetSdkVersion < 28 && this.f54010i == null) {
                return this.f54009h != null;
            }
            Boolean bool = this.f54010i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public g(u uVar) {
            if (!TextUtils.isEmpty(uVar.c())) {
                this.f54008g = uVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f54008g.c());
            bundle.putBundle("android.messagingStyleUser", this.f54008g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f54009h);
            if (this.f54009h != null && this.f54010i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f54009h);
            }
            if (!this.f54006e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f54006e));
            }
            if (!this.f54007f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f54007f));
            }
            Boolean bool = this.f54010i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.MessagingStyle messagingStyleB;
            k(j());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyleB = c.a(this.f54008g.h());
            } else {
                messagingStyleB = a.b(this.f54008g.c());
            }
            Iterator<d> it = this.f54006e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleB, it.next().g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<d> it2 = this.f54007f.iterator();
                while (it2.hasNext()) {
                    b.a(messagingStyleB, it2.next().g());
                }
            }
            if (this.f54010i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleB, this.f54009h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleB, this.f54010i.booleanValue());
            }
            messagingStyleB.setBuilder(lVar.a());
        }

        public g k(boolean z10) {
            this.f54010i = Boolean.valueOf(z10);
            return this;
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        protected e f54017a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f54018b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f54019c;

        /* renamed from: d, reason: collision with root package name */
        boolean f54020d = false;

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
            if (this.f54020d) {
                bundle.putCharSequence("android.summaryText", this.f54019c);
            }
            CharSequence charSequence = this.f54018b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public void g(e eVar) {
            if (this.f54017a != eVar) {
                this.f54017a = eVar;
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
        int dimensionPixelSize = resources.getDimensionPixelSize(Y1.c.f42780b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(Y1.c.f42779a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }
}
