package androidx.work;

import O4.G;
import O4.InterfaceC4363k;
import O4.S;
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
    private UUID f59283a;

    /* renamed from: b, reason: collision with root package name */
    private b f59284b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f59285c;

    /* renamed from: d, reason: collision with root package name */
    private a f59286d;

    /* renamed from: e, reason: collision with root package name */
    private int f59287e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f59288f;

    /* renamed from: g, reason: collision with root package name */
    private CoroutineContext f59289g;

    /* renamed from: h, reason: collision with root package name */
    private Y4.b f59290h;

    /* renamed from: i, reason: collision with root package name */
    private S f59291i;

    /* renamed from: j, reason: collision with root package name */
    private G f59292j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC4363k f59293k;

    /* renamed from: l, reason: collision with root package name */
    private int f59294l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f59295a;

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f59296b;

        /* renamed from: c, reason: collision with root package name */
        public Network f59297c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f59295a = list;
            this.f59296b = list;
        }
    }

    public Executor a() {
        return this.f59288f;
    }

    public InterfaceC4363k b() {
        return this.f59293k;
    }

    public UUID c() {
        return this.f59283a;
    }

    public b d() {
        return this.f59284b;
    }

    public Network e() {
        return this.f59286d.f59297c;
    }

    public G f() {
        return this.f59292j;
    }

    public int g() {
        return this.f59287e;
    }

    public Set<String> h() {
        return this.f59285c;
    }

    public Y4.b i() {
        return this.f59290h;
    }

    public List<String> j() {
        return this.f59286d.f59295a;
    }

    public List<Uri> k() {
        return this.f59286d.f59296b;
    }

    public CoroutineContext l() {
        return this.f59289g;
    }

    public S m() {
        return this.f59291i;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, Y4.b bVar2, S s10, G g10, InterfaceC4363k interfaceC4363k) {
        this.f59283a = uuid;
        this.f59284b = bVar;
        this.f59285c = new HashSet(collection);
        this.f59286d = aVar;
        this.f59287e = i10;
        this.f59294l = i11;
        this.f59288f = executor;
        this.f59289g = coroutineContext;
        this.f59290h = bVar2;
        this.f59291i = s10;
        this.f59292j = g10;
        this.f59293k = interfaceC4363k;
    }
}
