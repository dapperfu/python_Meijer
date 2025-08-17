package androidx.work;

import N4.G;
import N4.InterfaceC4323k;
import N4.S;
import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f59097a;

    /* renamed from: b, reason: collision with root package name */
    private b f59098b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f59099c;

    /* renamed from: d, reason: collision with root package name */
    private a f59100d;

    /* renamed from: e, reason: collision with root package name */
    private int f59101e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f59102f;

    /* renamed from: g, reason: collision with root package name */
    private CoroutineContext f59103g;

    /* renamed from: h, reason: collision with root package name */
    private X4.b f59104h;

    /* renamed from: i, reason: collision with root package name */
    private S f59105i;

    /* renamed from: j, reason: collision with root package name */
    private G f59106j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC4323k f59107k;

    /* renamed from: l, reason: collision with root package name */
    private int f59108l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f59109a;

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f59110b;

        /* renamed from: c, reason: collision with root package name */
        public Network f59111c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f59109a = list;
            this.f59110b = list;
        }
    }

    public Executor a() {
        return this.f59102f;
    }

    public InterfaceC4323k b() {
        return this.f59107k;
    }

    public UUID c() {
        return this.f59097a;
    }

    public b d() {
        return this.f59098b;
    }

    public Network e() {
        return this.f59100d.f59111c;
    }

    public G f() {
        return this.f59106j;
    }

    public int g() {
        return this.f59101e;
    }

    public Set<String> h() {
        return this.f59099c;
    }

    public X4.b i() {
        return this.f59104h;
    }

    public List<String> j() {
        return this.f59100d.f59109a;
    }

    public List<Uri> k() {
        return this.f59100d.f59110b;
    }

    public CoroutineContext l() {
        return this.f59103g;
    }

    public S m() {
        return this.f59105i;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, X4.b bVar2, S s10, G g10, InterfaceC4323k interfaceC4323k) {
        this.f59097a = uuid;
        this.f59098b = bVar;
        this.f59099c = new HashSet(collection);
        this.f59100d = aVar;
        this.f59101e = i10;
        this.f59108l = i11;
        this.f59102f = executor;
        this.f59103g = coroutineContext;
        this.f59104h = bVar2;
        this.f59105i = s10;
        this.f59106j = g10;
        this.f59107k = interfaceC4323k;
    }
}
