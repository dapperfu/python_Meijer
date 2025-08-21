package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* renamed from: a, reason: collision with root package name */
    protected final KotlinType f147224a;

    /* renamed from: b, reason: collision with root package name */
    private final ReceiverValue f147225b;

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AbstractReceiverValue(KotlinType kotlinType, ReceiverValue receiverValue) {
        if (kotlinType == null) {
            c(0);
        }
        this.f147224a = kotlinType;
        this.f147225b = receiverValue == null ? this : receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        KotlinType kotlinType = this.f147224a;
        if (kotlinType == null) {
            c(1);
        }
        return kotlinType;
    }
}
