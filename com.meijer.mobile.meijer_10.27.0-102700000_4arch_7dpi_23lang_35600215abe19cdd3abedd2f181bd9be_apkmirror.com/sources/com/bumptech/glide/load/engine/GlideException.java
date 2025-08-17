package com.bumptech.glide.load.engine;

import com.fullstory.FS;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class GlideException extends Exception {

    /* renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f63790g = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f63791a;

    /* renamed from: b, reason: collision with root package name */
    private V6.e f63792b;

    /* renamed from: c, reason: collision with root package name */
    private V6.a f63793c;

    /* renamed from: d, reason: collision with root package name */
    private Class<?> f63794d;

    /* renamed from: e, reason: collision with root package name */
    private String f63795e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f63796f;

    private static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f63797a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63798b = true;

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f63798b) {
                this.f63798b = false;
                this.f63797a.append("  ");
            }
            this.f63798b = c10 == '\n';
            this.f63797a.append(c10);
            return this;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        a(Appendable appendable) {
            this.f63797a = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f63798b) {
                this.f63798b = false;
                this.f63797a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f63798b = z10;
            this.f63797a.append(charSequenceA, i10, i11);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    void i(V6.e eVar, V6.a aVar) {
        j(eVar, aVar, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    public List<Throwable> e() {
        return this.f63791a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f63795e);
        sb2.append(this.f63794d != null ? ", " + this.f63794d : "");
        sb2.append(this.f63793c != null ? ", " + this.f63793c : "");
        sb2.append(this.f63792b != null ? ", " + this.f63792b : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listF) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void j(V6.e eVar, V6.a aVar, Class<?> cls) {
        this.f63792b = eVar;
        this.f63793c = aVar;
        this.f63794d = cls;
    }

    public void k(Exception exc) {
        this.f63796f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f63795e = str;
        setStackTrace(f63790g);
        this.f63791a = list;
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) throws IOException {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) throws IOException {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void g(String str) {
        List<Throwable> listF = f();
        int size = listF.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            FS.log_i(str, sb2.toString(), listF.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        h(printWriter);
    }
}
