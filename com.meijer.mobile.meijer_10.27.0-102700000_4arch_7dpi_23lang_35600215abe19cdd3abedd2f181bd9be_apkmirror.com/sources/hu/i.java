package hu;

import iu.AbstractC14763c;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes11.dex */
public class i implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f136365A = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final List<j> f136366y = iu.f.a(j.HTTP_2, j.SPDY_3, j.HTTP_1_1);

    /* renamed from: z, reason: collision with root package name */
    private static final List<f> f136367z = iu.f.a(f.f136349f, f.f136350g, f.f136351h);

    /* renamed from: a, reason: collision with root package name */
    private final iu.e f136368a;

    /* renamed from: b, reason: collision with root package name */
    private g f136369b;

    /* renamed from: c, reason: collision with root package name */
    private Proxy f136370c;

    /* renamed from: d, reason: collision with root package name */
    private List<j> f136371d;

    /* renamed from: e, reason: collision with root package name */
    private List<f> f136372e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f136373f;

    /* renamed from: g, reason: collision with root package name */
    private final List<Object> f136374g;

    /* renamed from: h, reason: collision with root package name */
    private ProxySelector f136375h;

    /* renamed from: i, reason: collision with root package name */
    private CookieHandler f136376i;

    /* renamed from: j, reason: collision with root package name */
    private iu.d f136377j;

    /* renamed from: k, reason: collision with root package name */
    private C14571b f136378k;

    /* renamed from: l, reason: collision with root package name */
    private SocketFactory f136379l;

    /* renamed from: m, reason: collision with root package name */
    private SSLSocketFactory f136380m;

    /* renamed from: n, reason: collision with root package name */
    private HostnameVerifier f136381n;

    /* renamed from: o, reason: collision with root package name */
    private C14572c f136382o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC14570a f136383p;

    /* renamed from: q, reason: collision with root package name */
    private e f136384q;

    /* renamed from: r, reason: collision with root package name */
    private h f136385r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f136386s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f136387t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f136388u;

    /* renamed from: v, reason: collision with root package name */
    private int f136389v;

    /* renamed from: w, reason: collision with root package name */
    private int f136390w;

    /* renamed from: x, reason: collision with root package name */
    private int f136391x;

    public i() {
        this.f136373f = new ArrayList();
        this.f136374g = new ArrayList();
        this.f136386s = true;
        this.f136387t = true;
        this.f136388u = true;
        this.f136389v = 10000;
        this.f136390w = 10000;
        this.f136391x = 10000;
        this.f136368a = new iu.e();
        this.f136369b = new g();
    }

    static class a extends AbstractC14763c {
        a() {
        }
    }

    static {
        AbstractC14763c.f138504b = new a();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i clone() {
        return new i(this);
    }

    public i b(C14571b c14571b) {
        this.f136378k = c14571b;
        this.f136377j = null;
        return this;
    }

    public void c(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j10 > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.f136389v = (int) millis;
    }

    public void d(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j10 > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.f136390w = (int) millis;
    }

    public void e(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j10 > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.f136391x = (int) millis;
    }

    private i(i iVar) {
        ArrayList arrayList = new ArrayList();
        this.f136373f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f136374g = arrayList2;
        this.f136386s = true;
        this.f136387t = true;
        this.f136388u = true;
        this.f136389v = 10000;
        this.f136390w = 10000;
        this.f136391x = 10000;
        this.f136368a = iVar.f136368a;
        this.f136369b = iVar.f136369b;
        this.f136370c = iVar.f136370c;
        this.f136371d = iVar.f136371d;
        this.f136372e = iVar.f136372e;
        arrayList.addAll(iVar.f136373f);
        arrayList2.addAll(iVar.f136374g);
        this.f136375h = iVar.f136375h;
        this.f136376i = iVar.f136376i;
        C14571b c14571b = iVar.f136378k;
        this.f136378k = c14571b;
        this.f136377j = c14571b != null ? c14571b.f136247a : iVar.f136377j;
        this.f136379l = iVar.f136379l;
        this.f136380m = iVar.f136380m;
        this.f136381n = iVar.f136381n;
        this.f136382o = iVar.f136382o;
        this.f136383p = iVar.f136383p;
        this.f136384q = iVar.f136384q;
        this.f136385r = iVar.f136385r;
        this.f136386s = iVar.f136386s;
        this.f136387t = iVar.f136387t;
        this.f136388u = iVar.f136388u;
        this.f136389v = iVar.f136389v;
        this.f136390w = iVar.f136390w;
        this.f136391x = iVar.f136391x;
    }
}
