package com.google.firebase.crashlytics.buildtools.reloc.com.google.common.util.concurrent;

import hf.l;
import hf.q;
import hf.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, c>> f89533a = new r().h().f();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f89534b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f89535c = new a();

    public static final class PotentialDeadlockException extends b {

        /* renamed from: c, reason: collision with root package name */
        private final b f89536c;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb2 = new StringBuilder(super.getMessage());
            for (Throwable cause = this.f89536c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    private static class b extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f89537a = new StackTraceElement[0];

        /* renamed from: b, reason: collision with root package name */
        static final l<String> f89538b = l.r(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static class c {
    }

    static class a extends ThreadLocal<ArrayList<c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return q.f(3);
        }

        a() {
        }
    }
}
