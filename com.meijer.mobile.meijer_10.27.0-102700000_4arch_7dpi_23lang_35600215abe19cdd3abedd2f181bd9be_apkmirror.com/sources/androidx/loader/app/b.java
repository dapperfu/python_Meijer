package androidx.loader.app;

import Z.o0;
import android.os.Bundle;
import androidx.view.C5988D;
import androidx.view.InterfaceC5989E;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f55305c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6030s f55306a;

    /* renamed from: b, reason: collision with root package name */
    private final C1120b f55307b;

    public static class a<D> extends C5988D<D> {

        /* renamed from: l, reason: collision with root package name */
        private final int f55308l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f55309m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC6030s f55310n;

        void r() {
        }

        @Override // androidx.view.AbstractC5985A
        protected void k() {
            if (b.f55305c) {
                FS.log_v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.view.AbstractC5985A
        protected void l() {
            if (b.f55305c) {
                FS.log_v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        Y2.a<D> p(boolean z10) {
            if (b.f55305c) {
                FS.log_v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f55308l);
            sb2.append(" : ");
            o2.b.a(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.AbstractC5985A
        public void n(InterfaceC5989E<? super D> interfaceC5989E) {
            super.n(interfaceC5989E);
            this.f55310n = null;
        }

        @Override // androidx.view.C5988D, androidx.view.AbstractC5985A
        public void o(D d10) {
            super.o(d10);
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f55308l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f55309m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C1120b extends c0 {

        /* renamed from: c, reason: collision with root package name */
        private static final f0.c f55311c = new a();

        /* renamed from: a, reason: collision with root package name */
        private o0<a> f55312a = new o0<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f55313b = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements f0.c {
            @Override // androidx.lifecycle.f0.c
            public <T extends c0> T create(Class<T> cls) {
                return new C1120b();
            }

            a() {
            }
        }

        static C1120b n(g0 g0Var) {
            return (C1120b) new f0(g0Var, f55311c).a(C1120b.class);
        }

        public void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f55312a.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f55312a.m(); i10++) {
                    a aVarN = this.f55312a.n(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f55312a.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarN.toString());
                    aVarN.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void o() {
            int iM = this.f55312a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                this.f55312a.n(i10).r();
            }
        }

        C1120b() {
        }

        @Override // androidx.view.c0
        protected void onCleared() {
            super.onCleared();
            int iM = this.f55312a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                this.f55312a.n(i10).p(true);
            }
            this.f55312a.b();
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f55307b.m(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f55307b.o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        o2.b.a(this.f55306a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }

    b(InterfaceC6030s interfaceC6030s, g0 g0Var) {
        this.f55306a = interfaceC6030s;
        this.f55307b = C1120b.n(g0Var);
    }
}
