package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public interface NullabilityAnnotationStates<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144269a = Companion.f144270a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144270a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final NullabilityAnnotationStates f144271b = new NullabilityAnnotationStatesImpl(MapsKt.k());

        public final NullabilityAnnotationStates a() {
            return f144271b;
        }

        private Companion() {
        }
    }

    T a(FqName fqName);
}
