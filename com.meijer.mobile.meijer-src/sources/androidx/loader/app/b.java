package androidx.loader.app;

import Z.o0;
import android.os.Bundle;
import androidx.view.C6130D;
import androidx.view.InterfaceC6131E;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f55529c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6172s f55530a;

    /* renamed from: b, reason: collision with root package name */
    private final C1133b f55531b;

    public static class a<D> extends C6130D<D> {

        /* renamed from: l, reason: collision with root package name */
        private final int f55532l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f55533m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC6172s f55534n;

        void r() {
        }

        @Override // androidx.view.AbstractC6127A
        protected void k() {
            if (b.f55529c) {
                FS.log_v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.view.AbstractC6127A
        protected void l() {
            if (b.f55529c) {
                FS.log_v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        Y2.a<D> p(boolean z10) {
            if (b.f55529c) {
                FS.log_v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f55532l);
            sb2.append(" : ");
            o2.b.a(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.AbstractC6127A
        public void n(InterfaceC6131E<? super D> interfaceC6131E) {
            super.n(interfaceC6131E);
            this.f55534n = null;
        }

        @Override // androidx.view.C6130D, androidx.view.AbstractC6127A
        public void o(D d10) {
            super.o(d10);
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f55532l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f55533m);
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
    static class C1133b extends c0 {

        /* renamed from: c, reason: collision with root package name */
        private static final f0.c f55535c = new a();

        /* renamed from: a, reason: collision with root package name */
        private o0<a> f55536a = new o0<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f55537b = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements f0.c {
            @Override // androidx.lifecycle.f0.c
            public <T extends c0> T create(Class<T> cls) {
                return new C1133b();
            }

            a() {
            }
        }

        static C1133b n(g0 g0Var) {
            return (C1133b) new f0(g0Var, f55535c).a(C1133b.class);
        }

        public void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f55536a.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f55536a.m(); i10++) {
                    a aVarN = this.f55536a.n(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f55536a.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarN.toString());
                    aVarN.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void o() {
            int iM = this.f55536a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                this.f55536a.n(i10).r();
            }
        }

        C1133b() {
        }

        @Override // androidx.view.c0
        protected void onCleared() {
            super.onCleared();
            int iM = this.f55536a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                this.f55536a.n(i10).p(true);
            }
            this.f55536a.b();
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f55531b.m(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f55531b.o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        o2.b.a(this.f55530a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }

    b(InterfaceC6172s interfaceC6172s, g0 g0Var) {
        this.f55530a = interfaceC6172s;
        this.f55531b = C1133b.n(g0Var);
    }
}
