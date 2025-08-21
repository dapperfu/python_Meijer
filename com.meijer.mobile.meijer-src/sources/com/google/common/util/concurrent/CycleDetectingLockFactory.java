package com.google.common.util.concurrent;

import Ee.O;
import Ee.U;
import Ee.V;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f88898a = new V().h().f();

    /* renamed from: b, reason: collision with root package name */
    private static final p f88899b = new p(CycleDetectingLockFactory.class);

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f88900c = new a();

    public static final class PotentialDeadlockException extends b {

        /* renamed from: c, reason: collision with root package name */
        private final b f88901c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f88901c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    private static class b extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f88902a = new StackTraceElement[0];

        /* renamed from: b, reason: collision with root package name */
        static final O<String> f88903b = O.B(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static class c {
    }

    class a extends ThreadLocal<ArrayList<c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return U.j(3);
        }

        a() {
        }
    }
}
