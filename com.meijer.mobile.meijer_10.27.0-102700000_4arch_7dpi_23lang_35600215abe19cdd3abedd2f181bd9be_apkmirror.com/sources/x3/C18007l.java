package x3;

import U3.r;
import android.net.Uri;
import e4.C13610b;
import e4.C13613e;
import e4.C13616h;
import e4.C13618j;
import f4.C13843b;
import g4.C14197a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.C18159b;

/* renamed from: x3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18007l implements u {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f169211s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: t, reason: collision with root package name */
    private static final a f169212t = new a(new a.InterfaceC2710a() { // from class: x3.j
        @Override // x3.C18007l.a.InterfaceC2710a
        public final Constructor a() {
            return C18007l.l();
        }
    });

    /* renamed from: u, reason: collision with root package name */
    private static final a f169213u = new a(new a.InterfaceC2710a() { // from class: x3.k
        @Override // x3.C18007l.a.InterfaceC2710a
        public final Constructor a() {
            return C18007l.m();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private boolean f169214b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f169215c;

    /* renamed from: d, reason: collision with root package name */
    private int f169216d;

    /* renamed from: e, reason: collision with root package name */
    private int f169217e;

    /* renamed from: f, reason: collision with root package name */
    private int f169218f;

    /* renamed from: g, reason: collision with root package name */
    private int f169219g;

    /* renamed from: h, reason: collision with root package name */
    private int f169220h;

    /* renamed from: i, reason: collision with root package name */
    private int f169221i;

    /* renamed from: j, reason: collision with root package name */
    private int f169222j;

    /* renamed from: l, reason: collision with root package name */
    private int f169224l;

    /* renamed from: m, reason: collision with root package name */
    private Ce.L<a3.t> f169225m;

    /* renamed from: q, reason: collision with root package name */
    private int f169229q;

    /* renamed from: r, reason: collision with root package name */
    private int f169230r;

    /* renamed from: k, reason: collision with root package name */
    private int f169223k = 1;

    /* renamed from: n, reason: collision with root package name */
    private int f169226n = 112800;

    /* renamed from: p, reason: collision with root package name */
    private r.a f169228p = new U3.h();

    /* renamed from: o, reason: collision with root package name */
    private boolean f169227o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2710a f169231a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f169232b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private Constructor<? extends InterfaceC18011p> f169233c;

        /* renamed from: x3.l$a$a, reason: collision with other inner class name */
        public interface InterfaceC2710a {
            Constructor<? extends InterfaceC18011p> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        private Constructor<? extends InterfaceC18011p> b() {
            synchronized (this.f169232b) {
                if (this.f169232b.get()) {
                    return this.f169233c;
                }
                try {
                    return this.f169231a.a();
                } catch (ClassNotFoundException unused) {
                    this.f169232b.set(true);
                    return this.f169233c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public a(InterfaceC2710a interfaceC2710a) {
            this.f169231a = interfaceC2710a;
        }

        public InterfaceC18011p a(Object... objArr) {
            Constructor<? extends InterfaceC18011p> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List<InterfaceC18011p> list) {
        switch (i10) {
            case 0:
                list.add(new C13610b());
                break;
            case 1:
                list.add(new C13613e());
                break;
            case 2:
                list.add(new C13616h((this.f169215c ? 2 : 0) | this.f169216d | (this.f169214b ? 1 : 0)));
                break;
            case 3:
                list.add(new C18159b((this.f169215c ? 2 : 0) | this.f169217e | (this.f169214b ? 1 : 0)));
                break;
            case 4:
                InterfaceC18011p interfaceC18011pA = f169212t.a(Integer.valueOf(this.f169218f));
                if (interfaceC18011pA == null) {
                    list.add(new C3.d(this.f169218f));
                    break;
                } else {
                    list.add(interfaceC18011pA);
                    break;
                }
            case 5:
                list.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new P3.e(this.f169228p, (this.f169227o ? 0 : 2) | this.f169219g));
                break;
            case 7:
                list.add(new Q3.f((this.f169215c ? 2 : 0) | this.f169222j | (this.f169214b ? 1 : 0)));
                break;
            case 8:
                list.add(new R3.h(this.f169228p, this.f169221i | R3.h.k(this.f169229q) | (this.f169227o ? 0 : 32)));
                list.add(new R3.n(this.f169228p, (this.f169227o ? 0 : 16) | this.f169220h | R3.n.r(this.f169229q)));
                break;
            case 9:
                list.add(new S3.d());
                break;
            case 10:
                list.add(new e4.C());
                break;
            case 11:
                if (this.f169225m == null) {
                    this.f169225m = Ce.L.x();
                }
                list.add(new e4.K(this.f169223k, !this.f169227o ? 1 : 0, this.f169228p, new d3.J(0L), new C13618j(this.f169224l, this.f169225m), this.f169226n));
                break;
            case 12:
                list.add(new C13843b());
                break;
            case 14:
                list.add(new F3.a(this.f169230r));
                break;
            case 15:
                InterfaceC18011p interfaceC18011pA2 = f169213u.a(new Object[0]);
                if (interfaceC18011pA2 != null) {
                    list.add(interfaceC18011pA2);
                    break;
                }
                break;
            case 16:
                list.add(new z3.b(!this.f169227o ? 1 : 0, this.f169228p));
                break;
            case 17:
                list.add(new T3.a());
                break;
            case 18:
                list.add(new C14197a());
                break;
            case 19:
                list.add(new B3.a());
                break;
            case 20:
                int i11 = this.f169220h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new E3.a());
                    break;
                }
                break;
            case 21:
                list.add(new A3.a());
                break;
        }
    }

    @Override // x3.u
    public synchronized InterfaceC18011p[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f169211s;
            arrayList = new ArrayList(iArr.length);
            int iB = a3.q.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = a3.q.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC18011p[]) arrayList.toArray(new InterfaceC18011p[arrayList.size()]);
    }

    @Override // x3.u
    public synchronized InterfaceC18011p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // x3.u
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C18007l b(int i10) {
        this.f169229q = i10;
        return this;
    }

    @Override // x3.u
    @Deprecated
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized C18007l c(boolean z10) {
        this.f169227o = z10;
        return this;
    }

    public synchronized C18007l n(int i10) {
        this.f169230r = i10;
        return this;
    }

    @Override // x3.u
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized C18007l a(r.a aVar) {
        this.f169228p = aVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC18011p> l() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC18011p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC18011p> m() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC18011p.class).getConstructor(null);
    }
}
