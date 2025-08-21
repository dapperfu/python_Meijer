package com.google.firebase.remoteconfig.internal;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import Vd.InterfaceC5515i;
import android.text.format.DateUtils;
import bf.InterfaceC6375a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.t;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: j, reason: collision with root package name */
    public static final long f90088j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    static final int[] f90089k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    private final Lf.e f90090a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.b<InterfaceC6375a> f90091b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f90092c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f90093d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f90094e;

    /* renamed from: f, reason: collision with root package name */
    private final f f90095f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f90096g;

    /* renamed from: h, reason: collision with root package name */
    private final t f90097h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f90098i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f90099a;

        /* renamed from: b, reason: collision with root package name */
        private final int f90100b;

        /* renamed from: c, reason: collision with root package name */
        private final g f90101c;

        /* renamed from: d, reason: collision with root package name */
        private final String f90102d;

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f90101c;
        }

        String e() {
            return this.f90102d;
        }

        int f() {
            return this.f90100b;
        }

        private a(Date date, int i10, g gVar, String str) {
            this.f90099a = date;
            this.f90100b = i10;
            this.f90101c = gVar;
            this.f90102d = str;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* renamed from: a, reason: collision with root package name */
        private final String f90106a;

        String b() {
            return this.f90106a;
        }

        b(String str) {
            this.f90106a = str;
        }
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean f(long j10, Date date) {
        Date dateF = this.f90097h.f();
        if (dateF.equals(t.f90155f)) {
            return false;
        }
        return date.before(new Date(dateF.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f90096g.fetch(this.f90096g.d(), str, str2, s(), this.f90097h.e(), map, p(), date2, this.f90097h.b());
                if (aVarFetch.d() != null) {
                    this.f90097h.n(aVarFetch.d().k());
                }
                if (aVarFetch.e() != null) {
                    this.f90097h.m(aVarFetch.e());
                }
                this.f90097h.j();
                return aVarFetch;
            } catch (FirebaseRemoteConfigServerException e10) {
                e = e10;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                t.a aVarV = v(firebaseRemoteConfigServerException.a(), date2);
                if (u(aVarV, firebaseRemoteConfigServerException.a())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(aVarV.a().getTime());
                }
                throw g(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e11) {
            e = e11;
            date2 = date;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5516j<a> m(AbstractC5516j<g> abstractC5516j, long j10, final Map<String, String> map) {
        final m mVar;
        AbstractC5516j abstractC5516jL;
        final Date date = new Date(this.f90093d.a());
        if (abstractC5516j.r() && f(j10, date)) {
            return C5519m.f(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            abstractC5516jL = C5519m.e(new FirebaseRemoteConfigFetchThrottledException(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            mVar = this;
        } else {
            final AbstractC5516j<String> id2 = this.f90090a.getId();
            final AbstractC5516j<com.google.firebase.installations.f> abstractC5516jA = this.f90090a.a(false);
            mVar = this;
            abstractC5516jL = C5519m.k(id2, abstractC5516jA).l(this.f90092c, new InterfaceC5509c() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j2) {
                    return m.a(this.f90078a, id2, abstractC5516jA, date, map, abstractC5516j2);
                }
            });
        }
        return abstractC5516jL.l(mVar.f90092c, new InterfaceC5509c() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j2) {
                return m.c(this.f90083a, date, abstractC5516j2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f90097h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        InterfaceC6375a interfaceC6375a = this.f90091b.get();
        if (interfaceC6375a == null) {
            return null;
        }
        return (Long) interfaceC6375a.e(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f90089k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f90094e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap map = new HashMap();
        InterfaceC6375a interfaceC6375a = this.f90091b.get();
        if (interfaceC6375a != null) {
            for (Map.Entry<String, Object> entry : interfaceC6375a.e(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private void w(Date date) {
        int iB = this.f90097h.a().b() + 1;
        this.f90097h.l(iB, new Date(date.getTime() + q(iB)));
    }

    public AbstractC5516j<a> i() {
        return j(this.f90097h.h());
    }

    public AbstractC5516j<a> j(final long j10) {
        final HashMap map = new HashMap(this.f90098i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + q2.f93563c + 1);
        return this.f90095f.e().l(this.f90092c, new InterfaceC5509c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return this.f90075a.m(abstractC5516j, j10, map);
            }
        });
    }

    public AbstractC5516j<a> n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f90098i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.b() + q2.f93563c + i10);
        return this.f90095f.e().l(this.f90092c, new InterfaceC5509c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return this.f90085a.m(abstractC5516j, 0L, map);
            }
        });
    }

    public long r() {
        return this.f90097h.g();
    }

    public m(Lf.e eVar, Kf.b<InterfaceC6375a> bVar, Executor executor, com.google.android.gms.common.util.f fVar, Random random, f fVar2, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map<String, String> map) {
        this.f90090a = eVar;
        this.f90091b = bVar;
        this.f90092c = executor;
        this.f90093d = fVar;
        this.f90094e = random;
        this.f90095f = fVar2;
        this.f90096g = configFetchHttpClient;
        this.f90097h = tVar;
        this.f90098i = map;
    }

    public static /* synthetic */ AbstractC5516j a(m mVar, AbstractC5516j abstractC5516j, AbstractC5516j abstractC5516j2, Date date, Map map, AbstractC5516j abstractC5516j3) {
        mVar.getClass();
        if (!abstractC5516j.r()) {
            return C5519m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", abstractC5516j.m()));
        }
        if (!abstractC5516j2.r()) {
            return C5519m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", abstractC5516j2.m()));
        }
        return mVar.l((String) abstractC5516j.n(), ((com.google.firebase.installations.f) abstractC5516j2.n()).b(), date, map);
    }

    public static /* synthetic */ AbstractC5516j c(m mVar, Date date, AbstractC5516j abstractC5516j) {
        mVar.x(abstractC5516j, date);
        return abstractC5516j;
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iA = firebaseRemoteConfigServerException.a();
        if (iA != 401) {
            if (iA != 403) {
                if (iA != 429) {
                    if (iA != 500) {
                        switch (iA) {
                            case HttpResponseStatus.ERROR_BAD_GATEWAY /* 502 */:
                            case HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE /* 503 */:
                            case HttpResponseStatus.ERROR_GATEWAY_TIMEOUT /* 504 */:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private AbstractC5516j<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a aVarK = k(str, str2, date, map);
            if (aVarK.f() != 0) {
                return C5519m.f(aVarK);
            }
            return this.f90095f.i(aVarK.d()).t(this.f90092c, new InterfaceC5515i() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // Vd.InterfaceC5515i
                public final AbstractC5516j then(Object obj) {
                    return C5519m.f(aVarK);
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return C5519m.e(e10);
        }
    }

    private boolean u(t.a aVar, int i10) {
        if (aVar.b() > 1 || i10 == 429) {
            return true;
        }
        return false;
    }

    private t.a v(int i10, Date date) {
        if (t(i10)) {
            w(date);
        }
        return this.f90097h.a();
    }

    private void x(AbstractC5516j<a> abstractC5516j, Date date) {
        if (abstractC5516j.r()) {
            this.f90097h.r(date);
            return;
        }
        Exception excM = abstractC5516j.m();
        if (excM == null) {
            return;
        }
        if (excM instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f90097h.s();
        } else {
            this.f90097h.q();
        }
    }
}
