package x3;

import U3.r;
import android.net.Uri;
import e4.C13759b;
import e4.C13762e;
import e4.C13765h;
import e4.C13767j;
import g4.C14326a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.C18286b;

/* renamed from: x3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18073l implements u {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f170299s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: t, reason: collision with root package name */
    private static final a f170300t = new a(new a.InterfaceC2734a() { // from class: x3.j
        @Override // x3.C18073l.a.InterfaceC2734a
        public final Constructor a() {
            return C18073l.l();
        }
    });

    /* renamed from: u, reason: collision with root package name */
    private static final a f170301u = new a(new a.InterfaceC2734a() { // from class: x3.k
        @Override // x3.C18073l.a.InterfaceC2734a
        public final Constructor a() {
            return C18073l.m();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private boolean f170302b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f170303c;

    /* renamed from: d, reason: collision with root package name */
    private int f170304d;

    /* renamed from: e, reason: collision with root package name */
    private int f170305e;

    /* renamed from: f, reason: collision with root package name */
    private int f170306f;

    /* renamed from: g, reason: collision with root package name */
    private int f170307g;

    /* renamed from: h, reason: collision with root package name */
    private int f170308h;

    /* renamed from: i, reason: collision with root package name */
    private int f170309i;

    /* renamed from: j, reason: collision with root package name */
    private int f170310j;

    /* renamed from: l, reason: collision with root package name */
    private int f170312l;

    /* renamed from: m, reason: collision with root package name */
    private Ee.L<a3.t> f170313m;

    /* renamed from: q, reason: collision with root package name */
    private int f170317q;

    /* renamed from: r, reason: collision with root package name */
    private int f170318r;

    /* renamed from: k, reason: collision with root package name */
    private int f170311k = 1;

    /* renamed from: n, reason: collision with root package name */
    private int f170314n = 112800;

    /* renamed from: p, reason: collision with root package name */
    private r.a f170316p = new U3.h();

    /* renamed from: o, reason: collision with root package name */
    private boolean f170315o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2734a f170319a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f170320b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private Constructor<? extends InterfaceC18077p> f170321c;

        /* renamed from: x3.l$a$a, reason: collision with other inner class name */
        public interface InterfaceC2734a {
            Constructor<? extends InterfaceC18077p> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        private Constructor<? extends InterfaceC18077p> b() {
            synchronized (this.f170320b) {
                if (this.f170320b.get()) {
                    return this.f170321c;
                }
                try {
                    return this.f170319a.a();
                } catch (ClassNotFoundException unused) {
                    this.f170320b.set(true);
                    return this.f170321c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public a(InterfaceC2734a interfaceC2734a) {
            this.f170319a = interfaceC2734a;
        }

        public InterfaceC18077p a(Object... objArr) {
            Constructor<? extends InterfaceC18077p> constructorB = b();
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

    private void i(int i10, List<InterfaceC18077p> list) {
        switch (i10) {
            case 0:
                list.add(new C13759b());
                break;
            case 1:
                list.add(new C13762e());
                break;
            case 2:
                list.add(new C13765h((this.f170303c ? 2 : 0) | this.f170304d | (this.f170302b ? 1 : 0)));
                break;
            case 3:
                list.add(new C18286b((this.f170303c ? 2 : 0) | this.f170305e | (this.f170302b ? 1 : 0)));
                break;
            case 4:
                InterfaceC18077p interfaceC18077pA = f170300t.a(Integer.valueOf(this.f170306f));
                if (interfaceC18077pA == null) {
                    list.add(new C3.d(this.f170306f));
                    break;
                } else {
                    list.add(interfaceC18077pA);
                    break;
                }
            case 5:
                list.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new P3.e(this.f170316p, (this.f170315o ? 0 : 2) | this.f170307g));
                break;
            case 7:
                list.add(new Q3.f((this.f170303c ? 2 : 0) | this.f170310j | (this.f170302b ? 1 : 0)));
                break;
            case 8:
                list.add(new R3.h(this.f170316p, this.f170309i | R3.h.k(this.f170317q) | (this.f170315o ? 0 : 32)));
                list.add(new R3.n(this.f170316p, (this.f170315o ? 0 : 16) | this.f170308h | R3.n.r(this.f170317q)));
                break;
            case 9:
                list.add(new S3.d());
                break;
            case 10:
                list.add(new e4.C());
                break;
            case 11:
                if (this.f170313m == null) {
                    this.f170313m = Ee.L.x();
                }
                list.add(new e4.K(this.f170311k, !this.f170315o ? 1 : 0, this.f170316p, new d3.J(0L), new C13767j(this.f170312l, this.f170313m), this.f170314n));
                break;
            case 12:
                list.add(new f4.b());
                break;
            case 14:
                list.add(new F3.a(this.f170318r));
                break;
            case 15:
                InterfaceC18077p interfaceC18077pA2 = f170301u.a(new Object[0]);
                if (interfaceC18077pA2 != null) {
                    list.add(interfaceC18077pA2);
                    break;
                }
                break;
            case 16:
                list.add(new z3.b(!this.f170315o ? 1 : 0, this.f170316p));
                break;
            case 17:
                list.add(new T3.a());
                break;
            case 18:
                list.add(new C14326a());
                break;
            case 19:
                list.add(new B3.a());
                break;
            case 20:
                int i11 = this.f170308h;
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
    public synchronized InterfaceC18077p[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f170299s;
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
        return (InterfaceC18077p[]) arrayList.toArray(new InterfaceC18077p[arrayList.size()]);
    }

    @Override // x3.u
    public synchronized InterfaceC18077p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // x3.u
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C18073l b(int i10) {
        this.f170317q = i10;
        return this;
    }

    @Override // x3.u
    @Deprecated
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized C18073l c(boolean z10) {
        this.f170315o = z10;
        return this;
    }

    public synchronized C18073l n(int i10) {
        this.f170318r = i10;
        return this;
    }

    @Override // x3.u
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized C18073l a(r.a aVar) {
        this.f170316p = aVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC18077p> l() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC18077p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC18077p> m() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC18077p.class).getConstructor(null);
    }
}
