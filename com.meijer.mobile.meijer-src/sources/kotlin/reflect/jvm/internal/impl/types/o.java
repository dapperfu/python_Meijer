package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
class o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeConstructor f147930a;

    /* renamed from: b, reason: collision with root package name */
    private final List f147931b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeAttributes f147932c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147933d;

    /* renamed from: e, reason: collision with root package name */
    private final MemberScope f147934e;

    public o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, MemberScope memberScope) {
        this.f147930a = typeConstructor;
        this.f147931b = list;
        this.f147932c = typeAttributes;
        this.f147933d = z10;
        this.f147934e = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.o(this.f147930a, this.f147931b, this.f147932c, this.f147933d, this.f147934e, (KotlinTypeRefiner) obj);
    }
}
