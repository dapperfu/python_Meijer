package com.gimbal.internal.rest.context;

import Nb.j;
import Nb.k;
import com.medallia.digital.mobilesdk.q2;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f65210a = C13785b.a(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f65211b = C13787d.a(a.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static ThreadFactory f65212c;

    /* renamed from: com.gimbal.internal.rest.context.a$a, reason: collision with other inner class name */
    final class RunnableC1263a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f65213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f65214b = null;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f65215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class f65216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f65217e;

        RunnableC1263a(String str, Object obj, Class cls, InterfaceC16021c interfaceC16021c) {
            this.f65213a = str;
            this.f65215c = obj;
            this.f65216d = cls;
            this.f65217e = interfaceC16021c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f65217e.a(a.this.b(this.f65213a, this.f65214b, this.f65215c, this.f65216d));
            } catch (e e10) {
                a.f65211b.g("RequestFailed {}:   {}/{}", a.g(this.f65213a), Integer.valueOf(e10.f65221a), e10.getMessage());
                C13784a unused = a.f65210a;
                e10.getMessage();
                this.f65217e.a(e10.f65221a, e10.getMessage());
            } catch (Error e11) {
                a.e(this.f65217e, e11, this.f65213a);
                throw e11;
            } catch (Exception e12) {
                a.e(this.f65217e, e12, this.f65213a);
            }
        }
    }

    final class b extends k {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f65219d;

        b(String str) {
            this.f65219d = str;
        }

        @Override // Nb.k
        protected final String b(Throwable th2) {
            return k.a("RequestFailed {}:   / {}", a.g(this.f65219d), th2.getMessage());
        }
    }

    private synchronized ThreadFactory h(String str) {
        try {
            if (f65212c == null) {
                j jVar = new j("BkgdRest", "{0}-{1}");
                jVar.f20774d = new b(str);
                f65212c = jVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65212c;
    }

    protected abstract T b(String str, Map<String, String> map, Object obj, Class<T> cls);

    static /* synthetic */ void e(InterfaceC16021c interfaceC16021c, Throwable th2, String str) {
        f65211b.g("RequestFailed {}:   {}", g(str), th2.getMessage());
        g(str);
        th2.getMessage();
        interfaceC16021c.a(10001, th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("?");
        if (iLastIndexOf >= 0) {
            str = str.substring(0, iLastIndexOf);
        }
        if (str.endsWith(q2.f93563c)) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf2 = str.lastIndexOf(q2.f93563c);
        return iLastIndexOf2 >= 0 ? str.substring(iLastIndexOf2) : str;
    }

    protected final void d(String str, Object obj, Class<T> cls, InterfaceC16021c<T> interfaceC16021c) {
        h(str).newThread(new RunnableC1263a(str, obj, cls, interfaceC16021c)).start();
    }
}
