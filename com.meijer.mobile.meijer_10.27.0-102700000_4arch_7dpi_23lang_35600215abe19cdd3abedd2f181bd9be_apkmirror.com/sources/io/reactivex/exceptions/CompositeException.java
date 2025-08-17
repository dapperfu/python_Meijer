package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f138230a;

    /* renamed from: b, reason: collision with root package name */
    private final String f138231b;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f138232c;

    static final class a extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        a() {
        }
    }

    static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f138233a;

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f138233a.println(obj);
        }

        c(PrintStream printStream) {
            this.f138233a = printStream;
        }
    }

    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f138234a;

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f138234a.println(obj);
        }

        d(PrintWriter printWriter) {
            this.f138234a = printWriter;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f138232c == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f138230a.iterator();
                Throwable thD = aVar;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : c(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            thD.initCause(next);
                        } catch (Throwable unused) {
                        }
                        thD = d(thD);
                    }
                }
                this.f138232c = aVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f138232c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    static abstract class b {
        abstract void a(Object obj);

        b() {
        }
    }

    private List<Throwable> c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void e(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f138230a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    public List<Throwable> b() {
        return this.f138230a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f138231b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new c(printStream));
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    Throwable d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null && th2 != cause) {
            while (true) {
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
            return cause;
        }
        return th2;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f138230a = listUnmodifiableList;
            this.f138231b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
