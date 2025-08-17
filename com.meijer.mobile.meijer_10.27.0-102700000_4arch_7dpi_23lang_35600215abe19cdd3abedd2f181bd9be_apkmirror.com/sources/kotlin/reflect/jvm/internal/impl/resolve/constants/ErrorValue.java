package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes13.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f146178b = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorValue a(String message) {
            Intrinsics.j(message, "message");
            return new ErrorValueWithMessage(message);
        }
    }

    public static final class ErrorValueWithMessage extends ErrorValue {

        /* renamed from: c, reason: collision with root package name */
        private final String f146179c;

        public ErrorValueWithMessage(String message) {
            Intrinsics.j(message, "message");
            this.f146179c = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ErrorType a(ModuleDescriptor module) {
            Intrinsics.j(module, "module");
            return ErrorUtils.d(ErrorTypeKind.f146953i0, this.f146179c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public String toString() {
            return this.f146179c;
        }
    }

    public ErrorValue() {
        super(Unit.f142422a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Unit b() {
        throw new UnsupportedOperationException();
    }
}
