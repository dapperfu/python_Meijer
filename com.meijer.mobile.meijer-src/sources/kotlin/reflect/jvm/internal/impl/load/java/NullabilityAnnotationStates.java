package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public interface NullabilityAnnotationStates<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f145176a = Companion.f145177a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f145177a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final NullabilityAnnotationStates f145178b = new NullabilityAnnotationStatesImpl(MapsKt.k());

        public final NullabilityAnnotationStates a() {
            return f145178b;
        }

        private Companion() {
        }
    }

    T a(FqName fqName);
}
