package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C11334e;
import java.util.Map;
import kd.AbstractC15136a;

/* loaded from: classes7.dex */
public final class S extends AbstractC15136a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    Bundle f88815a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f88816b;

    /* renamed from: c, reason: collision with root package name */
    private b f88817c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f88818a;

        /* renamed from: b, reason: collision with root package name */
        private final String f88819b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f88820c;

        /* renamed from: d, reason: collision with root package name */
        private final String f88821d;

        /* renamed from: e, reason: collision with root package name */
        private final String f88822e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f88823f;

        /* renamed from: g, reason: collision with root package name */
        private final String f88824g;

        /* renamed from: h, reason: collision with root package name */
        private final String f88825h;

        /* renamed from: i, reason: collision with root package name */
        private final String f88826i;

        /* renamed from: j, reason: collision with root package name */
        private final String f88827j;

        /* renamed from: k, reason: collision with root package name */
        private final String f88828k;

        /* renamed from: l, reason: collision with root package name */
        private final String f88829l;

        /* renamed from: m, reason: collision with root package name */
        private final String f88830m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f88831n;

        /* renamed from: o, reason: collision with root package name */
        private final String f88832o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f88833p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f88834q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f88835r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f88836s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f88837t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f88838u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f88839v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f88840w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f88841x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f88842y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f88843z;

        private b(J j10) {
            this.f88818a = j10.p("gcm.n.title");
            this.f88819b = j10.h("gcm.n.title");
            this.f88820c = b(j10, "gcm.n.title");
            this.f88821d = j10.p("gcm.n.body");
            this.f88822e = j10.h("gcm.n.body");
            this.f88823f = b(j10, "gcm.n.body");
            this.f88824g = j10.p("gcm.n.icon");
            this.f88826i = j10.o();
            this.f88827j = j10.p("gcm.n.tag");
            this.f88828k = j10.p("gcm.n.color");
            this.f88829l = j10.p("gcm.n.click_action");
            this.f88830m = j10.p("gcm.n.android_channel_id");
            this.f88831n = j10.f();
            this.f88825h = j10.p("gcm.n.image");
            this.f88832o = j10.p("gcm.n.ticker");
            this.f88833p = j10.b("gcm.n.notification_priority");
            this.f88834q = j10.b("gcm.n.visibility");
            this.f88835r = j10.b("gcm.n.notification_count");
            this.f88838u = j10.a("gcm.n.sticky");
            this.f88839v = j10.a("gcm.n.local_only");
            this.f88840w = j10.a("gcm.n.default_sound");
            this.f88841x = j10.a("gcm.n.default_vibrate_timings");
            this.f88842y = j10.a("gcm.n.default_light_settings");
            this.f88837t = j10.j("gcm.n.event_time");
            this.f88836s = j10.e();
            this.f88843z = j10.q();
        }

        public String a() {
            return this.f88821d;
        }

        public String c() {
            return this.f88827j;
        }

        public String d() {
            return this.f88818a;
        }

        private static String[] b(J j10, String str) {
            Object[] objArrG = j10.g(str);
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
        if (this.f88816b == null) {
            this.f88816b = C11334e.a.a(this.f88815a);
        }
        return this.f88816b;
    }

    public b T() {
        if (this.f88817c == null && J.t(this.f88815a)) {
            this.f88817c = new b(new J(this.f88815a));
        }
        return this.f88817c;
    }

    public S(Bundle bundle) {
        this.f88815a = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        T.c(this, parcel, i10);
    }
}
