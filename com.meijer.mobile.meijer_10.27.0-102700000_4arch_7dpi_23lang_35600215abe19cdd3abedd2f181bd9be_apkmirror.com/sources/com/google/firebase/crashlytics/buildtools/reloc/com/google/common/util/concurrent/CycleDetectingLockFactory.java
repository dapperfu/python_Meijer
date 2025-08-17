package com.google.firebase.crashlytics.buildtools.reloc.com.google.common.util.concurrent;

import ff.l;
import ff.q;
import ff.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, c>> f88693a = new r().h().f();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f88694b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f88695c = new a();

    public static final class PotentialDeadlockException extends b {

        /* renamed from: c, reason: collision with root package name */
        private final b f88696c;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb2 = new StringBuilder(super.getMessage());
            for (Throwable cause = this.f88696c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    private static class b extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f88697a = new StackTraceElement[0];

        /* renamed from: b, reason: collision with root package name */
        static final l<String> f88698b = l.r(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
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
