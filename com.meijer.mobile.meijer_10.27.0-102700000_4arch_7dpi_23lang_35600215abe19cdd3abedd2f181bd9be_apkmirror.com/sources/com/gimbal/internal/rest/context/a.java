package com.gimbal.internal.rest.context;

import Lb.j;
import Lb.k;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.medallia.digital.mobilesdk.q2;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f64370a = C6381b.a(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f64371b = C6383d.a(a.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static ThreadFactory f64372c;

    /* renamed from: com.gimbal.internal.rest.context.a$a, reason: collision with other inner class name */
    final class RunnableC1254a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f64374b = null;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f64375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class f64376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f64377e;

        RunnableC1254a(String str, Object obj, Class cls, InterfaceC15945c interfaceC15945c) {
            this.f64373a = str;
            this.f64375c = obj;
            this.f64376d = cls;
            this.f64377e = interfaceC15945c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f64377e.a(a.this.b(this.f64373a, this.f64374b, this.f64375c, this.f64376d));
            } catch (e e10) {
                a.f64371b.g("RequestFailed {}:   {}/{}", a.g(this.f64373a), Integer.valueOf(e10.f64381a), e10.getMessage());
                C6380a unused = a.f64370a;
                e10.getMessage();
                this.f64377e.a(e10.f64381a, e10.getMessage());
            } catch (Error e11) {
                a.e(this.f64377e, e11, this.f64373a);
                throw e11;
            } catch (Exception e12) {
                a.e(this.f64377e, e12, this.f64373a);
            }
        }
    }

    final class b extends k {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f64379d;

        b(String str) {
            this.f64379d = str;
        }

        @Override // Lb.k
        protected final String b(Throwable th2) {
            return k.a("RequestFailed {}:   / {}", a.g(this.f64379d), th2.getMessage());
        }
    }

    private synchronized ThreadFactory h(String str) {
        try {
            if (f64372c == null) {
                j jVar = new j("BkgdRest", "{0}-{1}");
                jVar.f17954d = new b(str);
                f64372c = jVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f64372c;
    }

    protected abstract T b(String str, Map<String, String> map, Object obj, Class<T> cls);

    static /* synthetic */ void e(InterfaceC15945c interfaceC15945c, Throwable th2, String str) {
        f64371b.g("RequestFailed {}:   {}", g(str), th2.getMessage());
        g(str);
        th2.getMessage();
        interfaceC15945c.a(10001, th2.getMessage());
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
        if (str.endsWith(q2.f92724c)) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf2 = str.lastIndexOf(q2.f92724c);
        return iLastIndexOf2 >= 0 ? str.substring(iLastIndexOf2) : str;
    }

    protected final void d(String str, Object obj, Class<T> cls, InterfaceC15945c<T> interfaceC15945c) {
        h(str).newThread(new RunnableC1254a(str, obj, cls, interfaceC15945c)).start();
    }
}
