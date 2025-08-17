package com.google.firebase.remoteconfig.internal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5231i;
import android.text.format.DateUtils;
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

/* loaded from: classes7.dex */
public class m {

    /* renamed from: j, reason: collision with root package name */
    public static final long f89246j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    static final int[] f89247k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    private final Jf.e f89248a;

    /* renamed from: b, reason: collision with root package name */
    private final If.b<Ze.a> f89249b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f89250c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f89251d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f89252e;

    /* renamed from: f, reason: collision with root package name */
    private final f f89253f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f89254g;

    /* renamed from: h, reason: collision with root package name */
    private final t f89255h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f89256i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f89257a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89258b;

        /* renamed from: c, reason: collision with root package name */
        private final g f89259c;

        /* renamed from: d, reason: collision with root package name */
        private final String f89260d;

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
            return this.f89259c;
        }

        String e() {
            return this.f89260d;
        }

        int f() {
            return this.f89258b;
        }

        private a(Date date, int i10, g gVar, String str) {
            this.f89257a = date;
            this.f89258b = i10;
            this.f89259c = gVar;
            this.f89260d = str;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* renamed from: a, reason: collision with root package name */
        private final String f89264a;

        String b() {
            return this.f89264a;
        }

        b(String str) {
            this.f89264a = str;
        }
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean f(long j10, Date date) {
        Date dateF = this.f89255h.f();
        if (dateF.equals(t.f89313f)) {
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
                a aVarFetch = this.f89254g.fetch(this.f89254g.d(), str, str2, s(), this.f89255h.e(), map, p(), date2, this.f89255h.b());
                if (aVarFetch.d() != null) {
                    this.f89255h.n(aVarFetch.d().k());
                }
                if (aVarFetch.e() != null) {
                    this.f89255h.m(aVarFetch.e());
                }
                this.f89255h.j();
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
    public AbstractC5232j<a> m(AbstractC5232j<g> abstractC5232j, long j10, final Map<String, String> map) {
        final m mVar;
        AbstractC5232j abstractC5232jL;
        final Date date = new Date(this.f89251d.a());
        if (abstractC5232j.r() && f(j10, date)) {
            return C5235m.f(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            abstractC5232jL = C5235m.e(new FirebaseRemoteConfigFetchThrottledException(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            mVar = this;
        } else {
            final AbstractC5232j<String> id2 = this.f89248a.getId();
            final AbstractC5232j<com.google.firebase.installations.f> abstractC5232jA = this.f89248a.a(false);
            mVar = this;
            abstractC5232jL = C5235m.k(id2, abstractC5232jA).l(this.f89250c, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j2) {
                    return m.a(this.f89236a, id2, abstractC5232jA, date, map, abstractC5232j2);
                }
            });
        }
        return abstractC5232jL.l(mVar.f89250c, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j2) {
                return m.c(this.f89241a, date, abstractC5232j2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f89255h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        Ze.a aVar = this.f89249b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.d(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f89247k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f89252e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap map = new HashMap();
        Ze.a aVar = this.f89249b.get();
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.d(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private void w(Date date) {
        int iB = this.f89255h.a().b() + 1;
        this.f89255h.l(iB, new Date(date.getTime() + q(iB)));
    }

    public AbstractC5232j<a> i() {
        return j(this.f89255h.h());
    }

    public AbstractC5232j<a> j(final long j10) {
        final HashMap map = new HashMap(this.f89256i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + q2.f92724c + 1);
        return this.f89253f.e().l(this.f89250c, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return this.f89233a.m(abstractC5232j, j10, map);
            }
        });
    }

    public AbstractC5232j<a> n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f89256i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.b() + q2.f92724c + i10);
        return this.f89253f.e().l(this.f89250c, new InterfaceC5225c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return this.f89243a.m(abstractC5232j, 0L, map);
            }
        });
    }

    public long r() {
        return this.f89255h.g();
    }

    public m(Jf.e eVar, If.b<Ze.a> bVar, Executor executor, com.google.android.gms.common.util.f fVar, Random random, f fVar2, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map<String, String> map) {
        this.f89248a = eVar;
        this.f89249b = bVar;
        this.f89250c = executor;
        this.f89251d = fVar;
        this.f89252e = random;
        this.f89253f = fVar2;
        this.f89254g = configFetchHttpClient;
        this.f89255h = tVar;
        this.f89256i = map;
    }

    public static /* synthetic */ AbstractC5232j a(m mVar, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, Date date, Map map, AbstractC5232j abstractC5232j3) {
        mVar.getClass();
        if (!abstractC5232j.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", abstractC5232j.m()));
        }
        if (!abstractC5232j2.r()) {
            return C5235m.e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", abstractC5232j2.m()));
        }
        return mVar.l((String) abstractC5232j.n(), ((com.google.firebase.installations.f) abstractC5232j2.n()).b(), date, map);
    }

    public static /* synthetic */ AbstractC5232j c(m mVar, Date date, AbstractC5232j abstractC5232j) {
        mVar.x(abstractC5232j, date);
        return abstractC5232j;
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

    private AbstractC5232j<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a aVarK = k(str, str2, date, map);
            if (aVarK.f() != 0) {
                return C5235m.f(aVarK);
            }
            return this.f89253f.i(aVarK.d()).t(this.f89250c, new InterfaceC5231i() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // Td.InterfaceC5231i
                public final AbstractC5232j then(Object obj) {
                    return C5235m.f(aVarK);
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return C5235m.e(e10);
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
        return this.f89255h.a();
    }

    private void x(AbstractC5232j<a> abstractC5232j, Date date) {
        if (abstractC5232j.r()) {
            this.f89255h.r(date);
            return;
        }
        Exception excM = abstractC5232j.m();
        if (excM == null) {
            return;
        }
        if (excM instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f89255h.s();
        } else {
            this.f89255h.q();
        }
    }
}
