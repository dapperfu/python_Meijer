package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class CheckResult {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f147055a;

    public static final class IllegalFunctionName extends CheckResult {

        /* renamed from: b, reason: collision with root package name */
        public static final IllegalFunctionName f147056b = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    public static final class IllegalSignature extends CheckResult {

        /* renamed from: b, reason: collision with root package name */
        private final String f147057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(String error) {
            super(false, null);
            Intrinsics.j(error, "error");
            this.f147057b = error;
        }
    }

    public static final class SuccessCheck extends CheckResult {

        /* renamed from: b, reason: collision with root package name */
        public static final SuccessCheck f147058b = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    public /* synthetic */ CheckResult(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    private CheckResult(boolean z10) {
        this.f147055a = z10;
    }

    public final boolean a() {
        return this.f147055a;
    }
}
