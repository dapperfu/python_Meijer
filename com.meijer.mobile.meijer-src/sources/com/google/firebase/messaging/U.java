package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C11459e;
import java.util.Map;
import md.AbstractC15707a;

/* loaded from: classes8.dex */
public final class U extends AbstractC15707a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    Bundle f89661a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f89662b;

    /* renamed from: c, reason: collision with root package name */
    private b f89663c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f89664a;

        /* renamed from: b, reason: collision with root package name */
        private final String f89665b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f89666c;

        /* renamed from: d, reason: collision with root package name */
        private final String f89667d;

        /* renamed from: e, reason: collision with root package name */
        private final String f89668e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f89669f;

        /* renamed from: g, reason: collision with root package name */
        private final String f89670g;

        /* renamed from: h, reason: collision with root package name */
        private final String f89671h;

        /* renamed from: i, reason: collision with root package name */
        private final String f89672i;

        /* renamed from: j, reason: collision with root package name */
        private final String f89673j;

        /* renamed from: k, reason: collision with root package name */
        private final String f89674k;

        /* renamed from: l, reason: collision with root package name */
        private final String f89675l;

        /* renamed from: m, reason: collision with root package name */
        private final String f89676m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f89677n;

        /* renamed from: o, reason: collision with root package name */
        private final String f89678o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f89679p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f89680q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f89681r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f89682s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f89683t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f89684u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f89685v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f89686w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f89687x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f89688y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f89689z;

        private b(L l10) {
            this.f89664a = l10.p("gcm.n.title");
            this.f89665b = l10.h("gcm.n.title");
            this.f89666c = b(l10, "gcm.n.title");
            this.f89667d = l10.p("gcm.n.body");
            this.f89668e = l10.h("gcm.n.body");
            this.f89669f = b(l10, "gcm.n.body");
            this.f89670g = l10.p("gcm.n.icon");
            this.f89672i = l10.o();
            this.f89673j = l10.p("gcm.n.tag");
            this.f89674k = l10.p("gcm.n.color");
            this.f89675l = l10.p("gcm.n.click_action");
            this.f89676m = l10.p("gcm.n.android_channel_id");
            this.f89677n = l10.f();
            this.f89671h = l10.p("gcm.n.image");
            this.f89678o = l10.p("gcm.n.ticker");
            this.f89679p = l10.b("gcm.n.notification_priority");
            this.f89680q = l10.b("gcm.n.visibility");
            this.f89681r = l10.b("gcm.n.notification_count");
            this.f89684u = l10.a("gcm.n.sticky");
            this.f89685v = l10.a("gcm.n.local_only");
            this.f89686w = l10.a("gcm.n.default_sound");
            this.f89687x = l10.a("gcm.n.default_vibrate_timings");
            this.f89688y = l10.a("gcm.n.default_light_settings");
            this.f89683t = l10.j("gcm.n.event_time");
            this.f89682s = l10.e();
            this.f89689z = l10.q();
        }

        public String a() {
            return this.f89667d;
        }

        public String c() {
            return this.f89673j;
        }

        public String d() {
            return this.f89664a;
        }

        private static String[] b(L l10, String str) {
            Object[] objArrG = l10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }
    }

    public Map<String, String> B() {
        if (this.f89662b == null) {
            this.f89662b = C11459e.a.a(this.f89661a);
        }
        return this.f89662b;
    }

    public b T() {
        if (this.f89663c == null && L.t(this.f89661a)) {
            this.f89663c = new b(new L(this.f89661a));
        }
        return this.f89663c;
    }

    public U(Bundle bundle) {
        this.f89661a = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        V.c(this, parcel, i10);
    }
}
