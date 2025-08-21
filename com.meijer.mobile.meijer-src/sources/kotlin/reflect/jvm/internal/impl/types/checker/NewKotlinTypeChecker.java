package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f147738b = Companion.f147739a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f147739a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final NewKotlinTypeCheckerImpl f147740b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.f147725a, null, 2, 0 == true ? 1 : 0);

        public final NewKotlinTypeCheckerImpl a() {
            return f147740b;
        }

        private Companion() {
        }
    }

    OverridingUtil a();

    KotlinTypeRefiner c();
}
