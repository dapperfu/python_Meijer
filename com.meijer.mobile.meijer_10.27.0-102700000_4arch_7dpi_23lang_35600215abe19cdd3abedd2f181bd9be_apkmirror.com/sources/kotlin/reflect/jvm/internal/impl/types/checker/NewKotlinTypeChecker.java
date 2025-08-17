package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146831b = Companion.f146832a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f146832a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final NewKotlinTypeCheckerImpl f146833b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.f146818a, null, 2, 0 == true ? 1 : 0);

        public final NewKotlinTypeCheckerImpl a() {
            return f146833b;
        }

        private Companion() {
        }
    }

    OverridingUtil a();

    KotlinTypeRefiner c();
}
