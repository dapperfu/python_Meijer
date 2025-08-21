package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class MultipleFailureException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f155485a;

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Iterator<Throwable> it = this.f155485a.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f155485a.size())));
        for (Throwable th2 : this.f155485a) {
            sb2.append(String.format("%n  %s(%s)", th2.getClass().getName(), th2.getMessage()));
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Iterator<Throwable> it = this.f155485a.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Iterator<Throwable> it = this.f155485a.iterator();
        while (it.hasNext()) {
            it.next().printStackTrace(printWriter);
        }
    }
}
