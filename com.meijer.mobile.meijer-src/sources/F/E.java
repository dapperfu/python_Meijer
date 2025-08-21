package F;

import C.InterfaceC3024i;
import D.a;
import F.InterfaceC3290z;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class E implements a.InterfaceC0103a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f8657a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final Object f8658b;

    /* renamed from: c, reason: collision with root package name */
    private int f8659c;

    /* renamed from: d, reason: collision with root package name */
    private final D.a f8660d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<InterfaceC3024i, a> f8661e;

    /* renamed from: f, reason: collision with root package name */
    private int f8662f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC3290z.a f8663a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f8664b;

        /* renamed from: c, reason: collision with root package name */
        private final b f8665c;

        /* renamed from: d, reason: collision with root package name */
        private final c f8666d;

        InterfaceC3290z.a a() {
            return this.f8663a;
        }

        void b() {
            try {
                Executor executor = this.f8664b;
                final b bVar = this.f8665c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: F.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C.P.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        void c() {
            try {
                Executor executor = this.f8664b;
                final c cVar = this.f8666d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: F.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C.P.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        InterfaceC3290z.a d(InterfaceC3290z.a aVar) {
            InterfaceC3290z.a aVar2 = this.f8663a;
            this.f8663a = aVar;
            return aVar2;
        }

        a(InterfaceC3290z.a aVar, Executor executor, b bVar, c cVar) {
            this.f8663a = aVar;
            this.f8664b = executor;
            this.f8665c = bVar;
            this.f8666d = cVar;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    private a b(String str) {
        for (InterfaceC3024i interfaceC3024i : this.f8661e.keySet()) {
            if (str.equals(((InterfaceC3289y) interfaceC3024i.a()).b())) {
                return this.f8661e.get(interfaceC3024i);
            }
        }
        return null;
    }

    private static boolean d(InterfaceC3290z.a aVar) {
        return aVar != null && aVar.b();
    }

    private void f() {
        if (C.P.f("CameraStateRegistry")) {
            this.f8657a.setLength(0);
            this.f8657a.append("Recalculating open cameras:\n");
            this.f8657a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f8657a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<InterfaceC3024i, a> entry : this.f8661e.entrySet()) {
            if (C.P.f("CameraStateRegistry")) {
                this.f8657a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i10++;
            }
        }
        if (C.P.f("CameraStateRegistry")) {
            this.f8657a.append("-------------------------------------------------------------------\n");
            this.f8657a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f8659c)));
            C.P.a("CameraStateRegistry", this.f8657a.toString());
        }
        this.f8662f = Math.max(this.f8659c - i10, 0);
    }

    private InterfaceC3290z.a k(InterfaceC3024i interfaceC3024i) {
        a aVarRemove = this.f8661e.remove(interfaceC3024i);
        if (aVarRemove == null) {
            return null;
        }
        f();
        return aVarRemove.a();
    }

    private InterfaceC3290z.a l(InterfaceC3024i interfaceC3024i, InterfaceC3290z.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC3290z.a aVarD = ((a) o2.i.h(this.f8661e.get(interfaceC3024i), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        InterfaceC3290z.a aVar2 = InterfaceC3290z.a.OPENING;
        if (aVar == aVar2) {
            o2.i.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(interfaceC3024i, aVar);
            f();
        }
        return aVarD;
    }

    @Override // D.a.InterfaceC0103a
    public void a(int i10, int i11) {
        synchronized (this.f8658b) {
            boolean z10 = true;
            this.f8659c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f8658b) {
            try {
                Iterator<Map.Entry<InterfaceC3024i, a>> it = this.f8661e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == InterfaceC3290z.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(C.InterfaceC3024i r7, F.InterfaceC3290z.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8658b
            monitor-enter(r0)
            int r1 = r6.f8662f     // Catch: java.lang.Throwable -> Le
            F.z$a r2 = F.InterfaceC3290z.a.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            F.z$a r2 = r6.k(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            F.z$a r2 = r6.l(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            D.a r2 = r6.f8660d     // Catch: java.lang.Throwable -> Le
            int r2 = r2.c()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            F.z$a r2 = F.InterfaceC3290z.a.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            C.n r2 = r7.a()     // Catch: java.lang.Throwable -> Le
            F.y r2 = (F.InterfaceC3289y) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> Le
            D.a r3 = r6.f8660d     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            F.E$a r2 = r6.b(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.f8662f     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<C.i, F.E$a> r8 = r6.f8661e     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            F.E$a r3 = (F.E.a) r3     // Catch: java.lang.Throwable -> Le
            F.z$a r3 = r3.a()     // Catch: java.lang.Throwable -> Le
            F.z$a r5 = F.InterfaceC3290z.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            C.i r3 = (C.InterfaceC3024i) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            F.E$a r1 = (F.E.a) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            F.z$a r1 = F.InterfaceC3290z.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.f8662f     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<C.i, F.E$a> r8 = r6.f8661e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            F.E$a r8 = (F.E.a) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            F.E$a r8 = (F.E.a) r8
            r8.c()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.b()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F.E.e(C.i, F.z$a, boolean):void");
    }

    public void g(InterfaceC3024i interfaceC3024i, Executor executor, b bVar, c cVar) {
        synchronized (this.f8658b) {
            o2.i.j(!this.f8661e.containsKey(interfaceC3024i), "Camera is already registered: " + interfaceC3024i);
            this.f8661e.put(interfaceC3024i, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC3024i interfaceC3024i) {
        boolean z10;
        synchronized (this.f8658b) {
            try {
                a aVar = (a) o2.i.h(this.f8661e.get(interfaceC3024i), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (C.P.f("CameraStateRegistry")) {
                    this.f8657a.setLength(0);
                    this.f8657a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC3024i, Integer.valueOf(this.f8662f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f8662f > 0 || d(aVar.a())) {
                    InterfaceC3290z.a aVar2 = InterfaceC3290z.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC3024i, aVar2);
                    z10 = true;
                }
                if (C.P.f("CameraStateRegistry")) {
                    this.f8657a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    C.P.a("CameraStateRegistry", this.f8657a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean j(String str, String str2) {
        synchronized (this.f8658b) {
            try {
                boolean z10 = true;
                if (this.f8660d.c() != 2) {
                    return true;
                }
                a aVarB = b(str);
                InterfaceC3290z.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                InterfaceC3290z.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                InterfaceC3290z.a aVar = InterfaceC3290z.a.OPEN;
                boolean z11 = aVar.equals(aVarA) || InterfaceC3290z.a.CONFIGURED.equals(aVarA);
                boolean z12 = aVar.equals(aVarA2) || InterfaceC3290z.a.CONFIGURED.equals(aVarA2);
                if (!z11 || !z12) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }

    public E(D.a aVar, int i10) {
        Object obj = new Object();
        this.f8658b = obj;
        this.f8661e = new HashMap();
        this.f8659c = i10;
        synchronized (obj) {
            this.f8660d = aVar;
            this.f8662f = this.f8659c;
        }
    }

    private static void h(InterfaceC3024i interfaceC3024i, InterfaceC3290z.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (H4.a.h()) {
            H4.a.j("CX:State[" + interfaceC3024i + "]", aVar.ordinal());
        }
    }
}
